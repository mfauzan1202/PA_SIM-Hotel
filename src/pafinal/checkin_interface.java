/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pafinal;

/**
 *
 * @author Armann
 */
public interface checkin_interface {
    public void checkin(String tanggal,String nama, String nik, String nomor);
    public void checkout(String noKamar, String nama);
}
