/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "detalle_facturacompra")
@NamedQueries({
    @NamedQuery(name = "DetalleFacturacompra.findAll", query = "SELECT d FROM DetalleFacturacompra d"),
    @NamedQuery(name = "DetalleFacturacompra.findByNumFactura", query = "SELECT d FROM DetalleFacturacompra d WHERE d.detalleFacturacompraPK.numFactura = :numFactura"),
    @NamedQuery(name = "DetalleFacturacompra.findByCodArticulo", query = "SELECT d FROM DetalleFacturacompra d WHERE d.detalleFacturacompraPK.codArticulo = :codArticulo"),
    @NamedQuery(name = "DetalleFacturacompra.findByCantidad", query = "SELECT d FROM DetalleFacturacompra d WHERE d.cantidad = :cantidad")})
public class DetalleFacturacompra implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetalleFacturacompraPK detalleFacturacompraPK;
    @Column(name = "cantidad")
    private Integer cantidad;
    @JoinColumn(name = "numFactura", referencedColumnName = "num_factura", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private FacturaPago facturaPago;
    @JoinColumn(name = "codArticulo", referencedColumnName = "codigoArticulo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Articulo articulo;

    public DetalleFacturacompra() {
    }

    public DetalleFacturacompra(DetalleFacturacompraPK detalleFacturacompraPK) {
        this.detalleFacturacompraPK = detalleFacturacompraPK;
    }

    public DetalleFacturacompra(int numFactura, int codArticulo) {
        this.detalleFacturacompraPK = new DetalleFacturacompraPK(numFactura, codArticulo);
    }

    public DetalleFacturacompraPK getDetalleFacturacompraPK() {
        return detalleFacturacompraPK;
    }

    public void setDetalleFacturacompraPK(DetalleFacturacompraPK detalleFacturacompraPK) {
        this.detalleFacturacompraPK = detalleFacturacompraPK;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public FacturaPago getFacturaPago() {
        return facturaPago;
    }

    public void setFacturaPago(FacturaPago facturaPago) {
        this.facturaPago = facturaPago;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detalleFacturacompraPK != null ? detalleFacturacompraPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleFacturacompra)) {
            return false;
        }
        DetalleFacturacompra other = (DetalleFacturacompra) object;
        if ((this.detalleFacturacompraPK == null && other.detalleFacturacompraPK != null) || (this.detalleFacturacompraPK != null && !this.detalleFacturacompraPK.equals(other.detalleFacturacompraPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.DetalleFacturacompra[ detalleFacturacompraPK=" + detalleFacturacompraPK + " ]";
    }
    
}
