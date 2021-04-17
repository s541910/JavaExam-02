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
public enum AreaZipCodes {
    MO(64468), AR(72201), CA(94203);

    private int zipcode;

    private AreaZipCodes(int zipcode) {
        this.zipcode = zipcode;
    }

    public int getZipcode() {
        return zipcode;
    }

}
