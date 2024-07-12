import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;


//Тази анотация означава, че клас "Group.java" е основният елемент на файла
@XmlRootElement(name = "group")
@XmlAccessorType(XmlAccessType.FIELD)
public class Group {

    // XmLElementWrapper генерира обвиващ елемент около XML елементите, родителския елемент
    @XmlElementWrapper(name = "studentList")
    // XmlElement задава името на вътрешните елементи
    @XmlElement(name = "student")
    private ArrayList<Student> students;
    private String number;
    private String department;

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void writeToXMLFile(String xmlFile, Group group) throws JAXBException {

        // Създаване на JAXB контекст
        JAXBContext context = JAXBContext.newInstance(Group.class);
        // Създаване на marshaller инстанция
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // Записване в System.out
        m.marshal(group, System.out);
        // Записване във файл
        m.marshal(group, new File(xmlFile));

    }
    public Group readerFromXMLFile(String xmlFile) throws JAXBException, FileNotFoundException {

        // Създаване на JAXB контекст
        JAXBContext context = JAXBContext.newInstance(Group.class);
        // Създаване на unmarshaller инстанция
        Unmarshaller um = context.createUnmarshaller();
        Group group = (Group) um.unmarshal(new FileReader(xmlFile));

        return group;
    }
}