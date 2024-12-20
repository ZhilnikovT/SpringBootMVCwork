package com.example.SpringBootMVC.SpringBootMVCPostgreSQL;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "clientsIdSeq", sequenceName = "clients_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clientsIdSeq")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "todo")
    private String todo;

    public Client() {
    }
    
    public Client(Integer id, String name, String email, String phone, String todo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.todo = todo;
    }
    
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getTodo() { return todo; }
    public void setTodo(String todo) { this.todo = todo; }

//    public String toString() {
//        return id.toString() + " " +  name + " " +  email + " " +  phone + " " +  todo;
//    }
}
