package model;

/**
 *
 * @author gui_m
 */
public class User {
    private String name;
    private String lasName;
    private int idade;
    private String result;

    public User(String name, String lasName, int idade) {
        this.name = name;
        this.lasName = lasName;
        this.idade = idade;
    }

    public User(String name, String lasName, int idade, String result) {
        this.name = name;
        this.lasName = lasName;
        this.idade = idade;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    
}
