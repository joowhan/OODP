class VehicleMain extends FinalVehicle {
  private String modelName = "Mustang";
  public static void main(String[] args) {
    VehicleMain myFastCar = new VehicleMain();
    myFastCar.honk();
    System.out.println(myFastCar.brand + " " + modelName);
  }
}