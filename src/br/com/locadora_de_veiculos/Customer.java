package br.com.locadora_de_veiculos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "vehicle", eager = true)
@RequestScoped
public class Customer {
    public Integer id;
    public String cnh;
    public String name;
    public String phone;

    /**
     * @param id
     * @param cnh
     * @param name
     * @param phone
     */
    public Customer(Integer id, String cnh, String name, String phone) {
        this.id = id;
        this.cnh = cnh;
        this.name = name;
        this.phone = phone;
    }

    /**
     * @return the cnh
     */
    public String getCnh() {
        return cnh;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param cnh the cnh to set
     */
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

}