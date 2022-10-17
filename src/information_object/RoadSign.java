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

    public void switchOn(){

    }

    public void switchOff(){

    }
}
