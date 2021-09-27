public class Delivery {

    private String item;
    private String deliver_name;
    private String date;
    public Delivery(String item, String deliver_name, String date){
        this.item = item;
        this.deliver_name = deliver_name;
        this.date = date;
    }

    public String getDate(){
        return this.date;
    }

    public String getItem(){
        return this.item;
    }

    public String getDeliver_name(){
        return this.deliver_name;
    }

    public String toString(){
        return "This package contains " + this.item + ".\n" + "This package is sent by " + this.deliver_name + ".\n" +
                "This package is sent on " + this.date + ".";

    }
}
