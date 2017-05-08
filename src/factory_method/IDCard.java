package factory_method;

public class IDCard extends Product {

    private String owner;

    IDCard(String owner) {
        System.out.println(owner + "のカードをつくります");
        this.owner = owner;
    }

    public void use() {
        System.out.println(owner + "のカードを使います");
    }

    public String getOwner() {
        return owner;
    }

}
