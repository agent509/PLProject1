package turk.customer;

public class Customer {

  private String name;
  private String address;
  private String city;
  private String state;
  private String postCode;

  public void setName(String a) { this.name = a;}
  public void setAddress(String a) { this.address = a;}
  public void setCity(String a) { this.city = a;}
  public void setState(String a) { this.state = a;}
  public void setPost(String a) { this.postCode = a;}

  public String getName(){return name;}
  public String getAddress(){return address;}
  public String getCity(){return city;}
  public String getState(){return state;}
  public String getPost(){return postCode;}

  public String getNameAndAddress(){
    return name + "\n" + address + "\n" + city + ", " + state + " " + postCode;
  }

}
