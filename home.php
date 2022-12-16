<?php
$name = $_POST["fname"];
$lastname = $_POST["lname"];
$email = $_POST["email"];
$message = $_POST["description"];
$cnt = 1;
$files = glob('messages/*txt');
   foreach($files as $filed) {
       $cnt = $cnt + 1;
   }
$file = fopen("messages/$cnt.txt","w");
echo fwrite($file,$name."\n".$lastname."\n".$email."\n".$message);
fclose($file);
echo("success");
?>