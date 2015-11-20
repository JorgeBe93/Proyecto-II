/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Jorge
 */
@Entity
@Table(name = "pago")
@NamedQueries({
    @NamedQuery(name = "Pago.findAll", query = "SELECT p FROM Pago p"),
    @NamedQuery(name = "Pago.findByCodigoPago", query = "SELECT p FROM Pago p WHERE p.codigoPago = :codigoPago"),
    @NamedQuery(name = "Pago.findByFecha", query = "SELECT p FROM Pago p WHERE p.fecha = :fecha"),
    @NamedQuery(name = "Pago.findByMontoTotal", query = "SELECT p FROM Pago p WHERE p.montoTotal = :montoTotal")})
public class Pago implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo_pago")
    private Integer codigoPago;
    @Basic(optional = false)
    @Column(name = "fecha")
    private String fecha;
    @Basic(optional = false)
    @Column(name = "monto_total")
    private int montoTotal;
    @JoinColumn(name = "cod_proveedor", referencedColumnName = "codigoProveedor")
    @ManyToOne(optional = false)
    private Proveedor codProveedor;
    @OneToMany(mappedBy = "idPago")
    private Collection<DetallePago> detallePagoCollection;

    public Pago() {
    }

    public Pago(Integer codigoPago) {
        this.codigoPago = codigoPago;
    }

    public Pago(Integer codigoPago, String fecha, int montoTotal) {
        this.codigoPago = codigoPago;
        this.fecha = fecha;
        this.montoTotal = montoTotal;
    }

    public Integer getCodigoPago() {
        return codigoPago;
    }

    public void setCodigoPago(Integer codigoPago) {
        this.codigoPago = codigoPago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Proveedor getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(Proveedor codProveedor) {
        this.codProveedor = codProveedor;
    }

    public Collection<DetallePago> getDetallePagoCollection() {
        return detallePagoCollection;
    }

    public void setDetallePagoCollection(Collection<DetallePago> detallePagoCollection) {
        this.detallePagoCollection = detallePagoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoPago != null ? codigoPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pago)) {
            return false;
        }
        Pago other = (Pago) object;
        if ((this.codigoPago == null && other.codigoPago != null) || (this.codigoPago != null && !this.codigoPago.equals(other.codigoPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Pago[ codigoPago=" + codigoPago + " ]";
    }
    
}
