/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listlab;

/**
 *
 * @author Dallas
 */
public class Employee {
    private String iD;
    private String occupation;
    
    public Employee(String iD, String occupation) {
        this.iD = iD;
        this.occupation = occupation;
    }

    public String getiD() {
        return iD;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
