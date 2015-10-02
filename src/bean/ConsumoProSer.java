/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Jorge
 */
@Entity
@Table(name = "consumo_pro_ser")
@NamedQueries({
    @NamedQuery(name = "ConsumoProSer.findAll", query = "SELECT c FROM ConsumoProSer c"),
    @NamedQuery(name = "ConsumoProSer.findByCodigoConsumo", query = "SELECT c FROM ConsumoProSer c WHERE c.codigoConsumo = :codigoConsumo"),
    @NamedQuery(name = "ConsumoProSer.findByCantidad", query = "SELECT c FROM ConsumoProSer c WHERE c.cantidad = :cantidad"),
    @NamedQuery(name = "ConsumoProSer.findByTotal", query = "SELECT c FROM ConsumoProSer c WHERE c.total = :total")})
public class ConsumoProSer implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoConsumo")
    private Integer codigoConsumo;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @Column(name = "total")
    private int total;
    @JoinColumn(name = "codigoPS", referencedColumnName = "codigoPS")
    @ManyToOne
    private ProductoServicio codigoPS;
    @JoinColumn(name = "codigoReserva", referencedColumnName = "codigoReserva")
    @ManyToOne
    private Reserva codigoReserva;
    @JoinColumn(name = "numFactura", referencedColumnName = "numFactura")
    @ManyToOne
    private FacturaCobro numFactura;

    public ConsumoProSer() {
    }

    public ConsumoProSer(Integer codigoConsumo) {
        this.codigoConsumo = codigoConsumo;
    }

    public ConsumoProSer(Integer codigoConsumo, int cantidad, int total) {
        this.codigoConsumo = codigoConsumo;
        this.cantidad = cantidad;
        this.total = total;
    }

    public Integer getCodigoConsumo() {
        return codigoConsumo;
    }

    public void setCodigoConsumo(Integer codigoConsumo) {
        Integer oldCodigoConsumo = this.codigoConsumo;
        this.codigoConsumo = codigoConsumo;
        changeSupport.firePropertyChange("codigoConsumo", oldCodigoConsumo, codigoConsumo);
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        int oldCantidad = this.cantidad;
        this.cantidad = cantidad;
        changeSupport.firePropertyChange("cantidad", oldCantidad, cantidad);
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        int oldTotal = this.total;
        this.total = total;
        changeSupport.firePropertyChange("total", oldTotal, total);
    }

    public ProductoServicio getCodigoPS() {
        return codigoPS;
    }

    public void setCodigoPS(ProductoServicio codigoPS) {
        ProductoServicio oldCodigoPS = this.codigoPS;
        this.codigoPS = codigoPS;
        changeSupport.firePropertyChange("codigoPS", oldCodigoPS, codigoPS);
    }

    public Reserva getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(Reserva codigoReserva) {
        Reserva oldCodigoReserva = this.codigoReserva;
        this.codigoReserva = codigoReserva;
        changeSupport.firePropertyChange("codigoReserva", oldCodigoReserva, codigoReserva);
    }

    public FacturaCobro getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(FacturaCobro numFactura) {
        FacturaCobro oldNumFactura = this.numFactura;
        this.numFactura = numFactura;
        changeSupport.firePropertyChange("numFactura", oldNumFactura, numFactura);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoConsumo != null ? codigoConsumo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConsumoProSer)) {
            return false;
        }
        ConsumoProSer other = (ConsumoProSer) object;
        if ((this.codigoConsumo == null && other.codigoConsumo != null) || (this.codigoConsumo != null && !this.codigoConsumo.equals(other.codigoConsumo))) {
            return false;
        }
        return true;
    }

    /* @Override
    public String toString() {
    return "bean.ConsumoProSer[ codigoConsumo=" + codigoConsumo + " ]";
    }*/
    @Override
    public String toString() {
        return "codigoConsumo=" + codigoConsumo + ", cantidad=" + cantidad + ", total=" + total + ", codigoPS=" + codigoPS + ", codigoReserva=" + codigoReserva + ", numFactura=" + numFactura;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
    
}
