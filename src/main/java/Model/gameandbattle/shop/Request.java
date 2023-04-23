package Model.gameandbattle.shop;

import Model.gameandbattle.Government;
import Model.gameandbattle.stockpile.Resource;

public class Request {
    private Government sender;
    private Government receiver;
    private Resource resource;
    private String message;
    private int price;
    private int amount;
    private int id;

    public Request(Government sender, Government receiver, Resource resource, String message, int price, int amount) {
        this.sender = sender;
        this.receiver = receiver;
        this.resource = resource;
        this.message = message;
        this.price = price;
        this.amount = amount;
        // TODO: 4/12/2023 add id
    }

    public Government getSender() {
        return sender;
    }

    public void setSender(Government sender) {
        this.sender = sender;
    }

    public Government getReceiver() {
        return receiver;
    }

    public void setReceiver(Government receiver) {
        this.receiver = receiver;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
