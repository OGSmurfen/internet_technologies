import javax.xml.bind.annotation.*;

@XmlRootElement(name = "student")
@XmlAccessorType(XmlAccessType.FIELD)
// Не е задължително но ако искате, можете да определите реда, в който да се запишат полетата
@XmlType(propOrder = { "fakNum", "name", "specialty"})
public class Student {

    private String name;
    //Ако името на променливата не е подходящо за записване в XML файл, можете лесно да се промените
    @XmlElement(name = "fakNum")
    private String number;
    private String specialty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}