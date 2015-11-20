/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "factura_pago")
@NamedQueries({
    @NamedQuery(name = "FacturaPago.findAll", query = "SELECT f FROM FacturaPago f"),
    @NamedQuery(name = "FacturaPago.findByNumFactura", query = "SELECT f FROM FacturaPago f WHERE f.numFactura = :numFactura"),
    @NamedQuery(name = "FacturaPago.findByFecha", query = "SELECT f FROM FacturaPago f WHERE f.fecha = :fecha"),
    @NamedQuery(name = "FacturaPago.findByOrdenCompra", query = "SELECT f FROM FacturaPago f WHERE f.ordenCompra = :ordenCompra"),
    @NamedQuery(name = "FacturaPago.findByEstado", query = "SELECT f FROM FacturaPago f WHERE f.estado = :estado"),
    @NamedQuery(name = "FacturaPago.findByMontoTotal", query = "SELECT f FROM FacturaPago f WHERE f.montoTotal = :montoTotal"),
    @NamedQuery(name = "FacturaPago.findByMontoTotalIva", query = "SELECT f FROM FacturaPago f WHERE f.montoTotalIva = :montoTotalIva"),
    @NamedQuery(name = "FacturaPago.findByFechaVence", query = "SELECT f FROM FacturaPago f WHERE f.fechaVence = :fechaVence")})
public class FacturaPago implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "num_factura")
    private Integer numFactura;
    @Basic(optional = false)
    @Column(name = "fecha")
    private String fecha;
    @Column(name = "orden_compra")
    private Integer ordenCompra;
    @Column(name = "estado")
    private String estado;
    @Column(name = "monto_total")
    private Integer montoTotal;
    @Column(name = "monto_total_iva")
    private Integer montoTotalIva;
    @Basic(optional = false)
    @Column(name = "fecha_vence")
    private String fechaVence;
    @JoinColumn(name = "cod_proveedor", referencedColumnName = "codigoProveedor")
    @ManyToOne
    private Proveedor codProveedor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facturaPago")
    private Collection<DetalleFacturacompra> detalleFacturacompraCollection;
    @OneToMany(mappedBy = "numFactura")
    private Collection<DetallePago> detallePagoCollection;

    public FacturaPago() {
    }

    public FacturaPago(Integer numFactura) {
        this.numFactura = numFactura;
    }

    public FacturaPago(Integer numFactura, String fecha, String fechaVence) {
        this.numFactura = numFactura;
        this.fecha = fecha;
        this.fechaVence = fechaVence;
    }

    public Integer getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(Integer numFactura) {
        this.numFactura = numFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(Integer ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Integer montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Integer getMontoTotalIva() {
        return montoTotalIva;
    }

    public void setMontoTotalIva(Integer montoTotalIva) {
        this.montoTotalIva = montoTotalIva;
    }

    public String getFechaVence() {
        return fechaVence;
    }

    public void setFechaVence(String fechaVence) {
        this.fechaVence = fechaVence;
    }

    public Proveedor getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(Proveedor codProveedor) {
        this.codProveedor = codProveedor;
    }

    public Collection<DetalleFacturacompra> getDetalleFacturacompraCollection() {
        return detalleFacturacompraCollection;
    }

    public void setDetalleFacturacompraCollection(Collection<DetalleFacturacompra> detalleFacturacompraCollection) {
        this.detalleFacturacompraCollection = detalleFacturacompraCollection;
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
        hash += (numFactura != null ? numFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FacturaPago)) {
            return false;
        }
        FacturaPago other = (FacturaPago) object;
        if ((this.numFactura == null && other.numFactura != null) || (this.numFactura != null && !this.numFactura.equals(other.numFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.FacturaPago[ numFactura=" + numFactura + " ]";
    }
    
}
