package org.example.lab7;

import java.util.List;
import java.util.Objects;

public class House {
    private String cadastralNum;
    private String address;
    private Person elder;
    private List<Flat> flatList;

    public House(String cadastralNum, String address, Person elder, List<Flat> flatList) {
        this.cadastralNum = cadastralNum;
        this.address = address;
        this.elder = elder;
        this.flatList = flatList;
    }

    public String getCadastralNum() {
        return cadastralNum;
    }

    public void setCadastralNum(String cadastralNum) {
        this.cadastralNum = cadastralNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person getElder() {
        return elder;
    }

    public void setElder(Person elder) {
        this.elder = elder;
    }

    public List<Flat> getFlatList() {
        return flatList;
    }

    public void setFlatList(List<Flat> flatList) {
        this.flatList = flatList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(cadastralNum, house.cadastralNum) && Objects.equals(address, house.address) && Objects.equals(elder, house.elder) && Objects.equals(flatList, house.flatList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cadastralNum, address, elder, flatList);
    }

    @Override
    public String toString() {
        return "House{" +
                "cadastralNum='" + cadastralNum + '\'' +
                ", address='" + address + '\'' +
                ", elder=" + elder +
                ", flatList=" + flatList +
                '}';
    }
}
