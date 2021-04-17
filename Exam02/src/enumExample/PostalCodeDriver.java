/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumExample;

/**
 *
 * @author Ramu Vallapurapu
 */
public class PostalCodeDriver {

    private String stateName;
    AreaZipCodes zipCodes;

    public PostalCodeDriver(String stateName, AreaZipCodes zipCodes) {
        this.stateName = stateName;
        this.zipCodes = zipCodes;
    }

    public static void main(String[] args) {
        System.out.println("Answer for Question 7: Ramu Vallapurapu");

        PostalCodeDriver p = new PostalCodeDriver("Missouri", AreaZipCodes.MO);

        System.out.println("StateName :" + p.stateName + "\nPostalCode:" + AreaZipCodes.MO.getZipcode());
        System.out.println(AreaZipCodes.CA);

    }
}
