public class Factory extends AbstractFactory{
    @Override
    public Message getMessage(String type){
        if(type==null){
            return null;
        }
        if(type.equals("irregularPower")){
            return new print_SW();
        }
        else if(type.equals("irregularMotorPower")){
            return new print_SW1();
        }
        else if(type.equals("reducedPower")){
            return new Print_HW();
        }
        return null;
    }
}
