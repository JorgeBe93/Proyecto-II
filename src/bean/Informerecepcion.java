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
@Table(name = "informerecepcion")
@NamedQueries({
    @NamedQuery(name = "Informerecepcion.findAll", query = "SELECT i FROM Informerecepcion i"),
    @NamedQuery(name = "Informerecepcion.findByCodInformeRecepcion", query = "SELECT i FROM Informerecepcion i WHERE i.codInformeRecepcion = :codInformeRecepcion"),
    @NamedQuery(name = "Informerecepcion.findByFecha", query = "SELECT i FROM Informerecepcion i WHERE i.fecha = :fecha"),
    @NamedQuery(name = "Informerecepcion.findByFechaVto", query = "SELECT i FROM Informerecepcion i WHERE i.fechaVto = :fechaVto")})
public class Informerecepcion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codInformeRecepcion")
    private Integer codInformeRecepcion;
    @Column(name = "fecha")
    private String fecha;
    @Column(name = "fechaVto")
    private String fechaVto;
    @JoinColumn(name = "nroFactura", referencedColumnName = "num_factura")
    @ManyToOne
    private FacturaPago nroFactura;
    @JoinColumn(name = "codOC", referencedColumnName = "cod_orden")
    @ManyToOne
    private OrdenCompra codOC;

    public Informerecepcion() {
    }

    public Informerecepcion(Integer codInformeRecepcion) {
        this.codInformeRecepcion = codInformeRecepcion;
    }

    public Integer getCodInformeRecepcion() {
        return codInformeRecepcion;
    }

    public void setCodInformeRecepcion(Integer codInformeRecepcion) {
        this.codInformeRecepcion = codInformeRecepcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFechaVto() {
        return fechaVto;
    }

    public void setFechaVto(String fechaVto) {
        this.fechaVto = fechaVto;
    }

    public FacturaPago getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(FacturaPago nroFactura) {
        this.nroFactura = nroFactura;
    }

    public OrdenCompra getCodOC() {
        return codOC;
    }

    public void setCodOC(OrdenCompra codOC) {
        this.codOC = codOC;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codInformeRecepcion != null ? codInformeRecepcion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Informerecepcion)) {
            return false;
        }
        Informerecepcion other = (Informerecepcion) object;
        if ((this.codInformeRecepcion == null && other.codInformeRecepcion != null) || (this.codInformeRecepcion != null && !this.codInformeRecepcion.equals(other.codInformeRecepcion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Informerecepcion[ codInformeRecepcion=" + codInformeRecepcion + " ]";
    }
    
}
