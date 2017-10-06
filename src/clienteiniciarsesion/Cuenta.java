/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteiniciarsesion;

import java.io.Serializable;

/**
 *
 * @author Mari
 */

public class Cuenta implements Serializable {

  private String usuario;

  private String clave;

  public Cuenta() {
  }

  public Cuenta(String usuario) {
    this.usuario = usuario;
  }

  public Cuenta(String usuario, String clave) {
    this.usuario = usuario;
    this.clave = clave;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public String getClave() {
    return clave;
  }

  public void setClave(String clave) {
    this.clave = clave;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (usuario != null ? usuario.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof Cuenta)) {
      return false;
    }
    Cuenta other = (Cuenta) object;
    if ((this.usuario == null && other.usuario != null) || (this.usuario != null && !this.usuario.equals(other.usuario))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "serveriniciosesion.Cuenta[ usuario=" + usuario + " ]";
  }
  
}
