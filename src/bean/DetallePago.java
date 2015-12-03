/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

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

/**
 *
 * @author Jorge
 */
@Entity
@Table(name = "detalle_pago")
@NamedQueries({
    @NamedQuery(name = "DetallePago.findAll", query = "SELECT d FROM DetallePago d"),
    @NamedQuery(name = "DetallePago.findByIddetallePago", query = "SELECT d FROM DetallePago d WHERE d.iddetallePago = :iddetallePago")})
public class DetallePago implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddetalle_pago")
    private Integer iddetallePago;
    @JoinColumn(name = "num_factura", referencedColumnName = "num_factura")
    @ManyToOne
    private FacturaPago numFactura;
    @JoinColumn(name = "id_extraccion", referencedColumnName = "codigoExtraccionDeposito")
    @ManyToOne
    private ExtraccionDeposito idExtraccion;
    @JoinColumn(name = "id_pago", referencedColumnName = "codigo_pago")
    @ManyToOne
    private Pago idPago;

    public DetallePago() {
    }

    public DetallePago(Integer iddetallePago) {
        this.iddetallePago = iddetallePago;
    }

    public Integer getIddetallePago() {
        return iddetallePago;
    }

    public void setIddetallePago(Integer iddetallePago) {
        this.iddetallePago = iddetallePago;
    }

    public FacturaPago getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(FacturaPago numFactura) {
        this.numFactura = numFactura;
    }

    public ExtraccionDeposito getIdExtraccion() {
        return idExtraccion;
    }

    public void setIdExtraccion(ExtraccionDeposito idExtraccion) {
        this.idExtraccion = idExtraccion;
    }

    public Pago getIdPago() {
        return idPago;
    }

    public void setIdPago(Pago idPago) {
        this.idPago = idPago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetallePago != null ? iddetallePago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallePago)) {
            return false;
        }
        DetallePago other = (DetallePago) object;
        if ((this.iddetallePago == null && other.iddetallePago != null) || (this.iddetallePago != null && !this.iddetallePago.equals(other.iddetallePago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.DetallePago[ iddetallePago=" + iddetallePago + " ]";
    }
    
}
