/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package status;

/**
 *
 * @author mehak
 */
public enum StatusCode {
    ZERO ("REJECTED"),
    ONE ("PENDING"),
    TWO ("PROCESSING"),
    THREE ("APPROVED"),
    DEFAULT ("NOT VALID CODE");
    
    final private String code;
    
    public String getCode() {
        return code;
    }
    
    private StatusCode(String code) {
        this.code = code;
    }
    
    
}
