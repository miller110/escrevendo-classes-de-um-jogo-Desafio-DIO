public class Hero {
    private String name;
    private int age;
    private String type;

    public Hero(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void attack() {
        String attack = "";

        switch (type.toLowerCase()) {
            case "mago":
                attack = "magia";
                break;
            case "guerreiro":
                attack = "espada";
                break;
            case "monge":
                attack = "artes maciais";
                break;
            case "ninja":
                attack = "shuriken";
                break;
        }

        System.out.println("O " + type + " atacou usando " + attack);
    }
}
