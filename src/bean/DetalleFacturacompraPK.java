/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Jorge
 */
@Embeddable
public class DetalleFacturacompraPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "numFactura")
    private int numFactura;
    @Basic(optional = false)
    @Column(name = "codArticulo")
    private int codArticulo;

    public DetalleFacturacompraPK() {
    }

    public DetalleFacturacompraPK(int numFactura, int codArticulo) {
        this.numFactura = numFactura;
        this.codArticulo = codArticulo;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public int getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(int codArticulo) {
        this.codArticulo = codArticulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numFactura;
        hash += (int) codArticulo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleFacturacompraPK)) {
            return false;
        }
        DetalleFacturacompraPK other = (DetalleFacturacompraPK) object;
        if (this.numFactura != other.numFactura) {
            return false;
        }
        if (this.codArticulo != other.codArticulo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.DetalleFacturacompraPK[ numFactura=" + numFactura + ", codArticulo=" + codArticulo + " ]";
    }
    
}
