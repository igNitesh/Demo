package core_java.array.object_colab.modal;

public class School{
    private String name;
    private String add ;

    public School() {
    }

    public School(String name, String add) {
        this.name = name;
        this.add = add;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAdd() {
        return add;
    }
    public void setAdd(String add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "School [name=" + name + ", add=" + add + "]";
    }
     
}