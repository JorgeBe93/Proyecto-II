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
@Table(name = "detalle_orden_compra")
@NamedQueries({
    @NamedQuery(name = "DetalleOrdenCompra.findAll", query = "SELECT d FROM DetalleOrdenCompra d"),
    @NamedQuery(name = "DetalleOrdenCompra.findByCodDetalle", query = "SELECT d FROM DetalleOrdenCompra d WHERE d.codDetalle = :codDetalle"),
    @NamedQuery(name = "DetalleOrdenCompra.findByCantidadPedida", query = "SELECT d FROM DetalleOrdenCompra d WHERE d.cantidadPedida = :cantidadPedida"),
    @NamedQuery(name = "DetalleOrdenCompra.findByEstado", query = "SELECT d FROM DetalleOrdenCompra d WHERE d.estado = :estado"),
    @NamedQuery(name = "DetalleOrdenCompra.findByCodOrden", query = "SELECT d FROM DetalleOrdenCompra d WHERE d.codOrden = :codOrden"),
    @NamedQuery(name = "DetalleOrdenCompra.findByCantidadRecibida", query = "SELECT d FROM DetalleOrdenCompra d WHERE d.cantidadRecibida = :cantidadRecibida")})
public class DetalleOrdenCompra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_detalle")
    private Integer codDetalle;
    @Basic(optional = false)
    @Column(name = "cantidadPedida")
    private int cantidadPedida;
    @Column(name = "estado")
    private String estado;
    @Column(name = "cod_orden")
    private Integer codOrden;
    @Column(name = "cantidadRecibida")
    private Integer cantidadRecibida;
    @JoinColumn(name = "cod_proveedor", referencedColumnName = "codigoProveedor")
    @ManyToOne(optional = false)
    private Proveedor codProveedor;
    @JoinColumn(name = "cod_articulo", referencedColumnName = "codigoArticulo")
    @ManyToOne(optional = false)
    private Articulo codArticulo;

    public DetalleOrdenCompra() {
    }

    public DetalleOrdenCompra(Integer codDetalle) {
        this.codDetalle = codDetalle;
    }

    public DetalleOrdenCompra(Integer codDetalle, int cantidadPedida) {
        this.codDetalle = codDetalle;
        this.cantidadPedida = cantidadPedida;
    }

    public Integer getCodDetalle() {
        return codDetalle;
    }

    public void setCodDetalle(Integer codDetalle) {
        this.codDetalle = codDetalle;
    }

    public int getCantidadPedida() {
        return cantidadPedida;
    }

    public void setCantidadPedida(int cantidadPedida) {
        this.cantidadPedida = cantidadPedida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getCodOrden() {
        return codOrden;
    }

    public void setCodOrden(Integer codOrden) {
        this.codOrden = codOrden;
    }

    public Integer getCantidadRecibida() {
        return cantidadRecibida;
    }

    public void setCantidadRecibida(Integer cantidadRecibida) {
        this.cantidadRecibida = cantidadRecibida;
    }

    public Proveedor getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(Proveedor codProveedor) {
        this.codProveedor = codProveedor;
    }

    public Articulo getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(Articulo codArticulo) {
        this.codArticulo = codArticulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codDetalle != null ? codDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleOrdenCompra)) {
            return false;
        }
        DetalleOrdenCompra other = (DetalleOrdenCompra) object;
        if ((this.codDetalle == null && other.codDetalle != null) || (this.codDetalle != null && !this.codDetalle.equals(other.codDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.DetalleOrdenCompra[ codDetalle=" + codDetalle + " ]";
    }
    
}
