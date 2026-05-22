class Owner {
    private String ownerName;
    private String phoneNo;

    public Owner() {
        this.ownerName = "Unknown";
        this.phoneNo = "Unknown";
    }

    public Owner(String name, String num) {
        this.ownerName = name;
        this.phoneNo = num;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    public String getPhoneNo() {
        return this.phoneNo;
    }

    public void setPhoneNo(String num) {
        this.phoneNo = num;
    }
}

class Bicycle {
    private Owner owner;

    public Bicycle() {
        this.owner = new Owner();
    }

    public Bicycle(Owner owner) {
        this.owner = owner;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
