package information_object;

public class RoadSign implements InformationObject, Light {

    private String typeOfSign;

    RoadSign(String typeOfSign){
        setTypeOfSign(typeOfSign);
    }

    public void setTypeOfSign(String type){
        typeOfSign = type;
    }

    public String getTypeOfSign(){
        return typeOfSign;
    }

    @Override
    public void switchOn(){

    }

    @Override
    public void switchOff(){

    }

    @Override
    public void moveSigh() {

    }

    @Override
    public void removeSign() {

    }
}
