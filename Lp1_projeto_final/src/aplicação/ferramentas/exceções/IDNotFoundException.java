/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicação.ferramentas.exceções;

/**
 *
 * @author gabri
 */
public class IDNotFoundException extends Exception {
    public IDNotFoundException(String message) {
        super(message);
    }
}
