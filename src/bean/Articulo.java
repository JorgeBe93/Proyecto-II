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
@Table(name = "articulo")
@NamedQueries({
    @NamedQuery(name = "Articulo.findAll", query = "SELECT a FROM Articulo a"),
    @NamedQuery(name = "Articulo.findByCodigoArticulo", query = "SELECT a FROM Articulo a WHERE a.codigoArticulo = :codigoArticulo"),
    @NamedQuery(name = "Articulo.findByNombre", query = "SELECT a FROM Articulo a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Articulo.findByCantidadStock", query = "SELECT a FROM Articulo a WHERE a.cantidadStock = :cantidadStock"),
    @NamedQuery(name = "Articulo.findByCantidadMinima", query = "SELECT a FROM Articulo a WHERE a.cantidadMinima = :cantidadMinima")})
public class Articulo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoArticulo")
    private Integer codigoArticulo;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "cantidadStock")
    private int cantidadStock;
    @Basic(optional = false)
    @Column(name = "cantidadMinima")
    private int cantidadMinima;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codigoArticulo")
    private Collection<MovimientoStock> movimientoStockCollection;
    @JoinColumn(name = "codigoProveedor", referencedColumnName = "codigoProveedor")
    @ManyToOne(optional = false)
    private Proveedor codigoProveedor;

    public Articulo() {
    }

    public Articulo(Integer codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public Articulo(Integer codigoArticulo, String nombre, int cantidadStock, int cantidadMinima) {
        this.codigoArticulo = codigoArticulo;
        this.nombre = nombre;
        this.cantidadStock = cantidadStock;
        this.cantidadMinima = cantidadMinima;
    }

    public Integer getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(Integer codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public Collection<MovimientoStock> getMovimientoStockCollection() {
        return movimientoStockCollection;
    }

    public void setMovimientoStockCollection(Collection<MovimientoStock> movimientoStockCollection) {
        this.movimientoStockCollection = movimientoStockCollection;
    }

    public Proveedor getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(Proveedor codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoArticulo != null ? codigoArticulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Articulo)) {
            return false;
        }
        Articulo other = (Articulo) object;
        if ((this.codigoArticulo == null && other.codigoArticulo != null) || (this.codigoArticulo != null && !this.codigoArticulo.equals(other.codigoArticulo))) {
            return false;
        }
        return true;
    }

    /* @Override
    public String toString() {
    return "bean.Articulo[ codigoArticulo=" + codigoArticulo + " ]";
    }*/
    @Override
    public String toString() {
        return "codigoArticulo=" + codigoArticulo + ", nombre=" + nombre + ", cantidadStock=" + cantidadStock + ", cantidadMinima=" + cantidadMinima;
    }
    
    
}
