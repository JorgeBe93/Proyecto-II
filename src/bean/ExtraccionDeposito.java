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
@Table(name = "extraccion_deposito")
@NamedQueries({
    @NamedQuery(name = "ExtraccionDeposito.findAll", query = "SELECT e FROM ExtraccionDeposito e"),
    @NamedQuery(name = "ExtraccionDeposito.findByCodigoExtraccionDeposito", query = "SELECT e FROM ExtraccionDeposito e WHERE e.codigoExtraccionDeposito = :codigoExtraccionDeposito"),
    @NamedQuery(name = "ExtraccionDeposito.findByFecha", query = "SELECT e FROM ExtraccionDeposito e WHERE e.fecha = :fecha"),
    @NamedQuery(name = "ExtraccionDeposito.findByMonto", query = "SELECT e FROM ExtraccionDeposito e WHERE e.monto = :monto"),
    @NamedQuery(name = "ExtraccionDeposito.findByTipo", query = "SELECT e FROM ExtraccionDeposito e WHERE e.tipo = :tipo")})
public class ExtraccionDeposito implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoExtraccionDeposito")
    private Integer codigoExtraccionDeposito;
    @Basic(optional = false)
    @Column(name = "fecha")
    private String fecha;
    @Basic(optional = false)
    @Column(name = "monto")
    private int monto;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @OneToMany(mappedBy = "idExtraccion")
    private Collection<DetallePago> detallePagoCollection;
    @JoinColumn(name = "idCuentaBancaria", referencedColumnName = "idCuentaBancaria")
    @ManyToOne(optional = false)
    private CuentaBancaria idCuentaBancaria;

    public ExtraccionDeposito() {
    }

    public ExtraccionDeposito(Integer codigoExtraccionDeposito) {
        this.codigoExtraccionDeposito = codigoExtraccionDeposito;
    }

    public ExtraccionDeposito(Integer codigoExtraccionDeposito, String fecha, int monto, String tipo) {
        this.codigoExtraccionDeposito = codigoExtraccionDeposito;
        this.fecha = fecha;
        this.monto = monto;
        this.tipo = tipo;
    }

    public Integer getCodigoExtraccionDeposito() {
        return codigoExtraccionDeposito;
    }

    public void setCodigoExtraccionDeposito(Integer codigoExtraccionDeposito) {
        this.codigoExtraccionDeposito = codigoExtraccionDeposito;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Collection<DetallePago> getDetallePagoCollection() {
        return detallePagoCollection;
    }

    public void setDetallePagoCollection(Collection<DetallePago> detallePagoCollection) {
        this.detallePagoCollection = detallePagoCollection;
    }

    public CuentaBancaria getIdCuentaBancaria() {
        return idCuentaBancaria;
    }

    public void setIdCuentaBancaria(CuentaBancaria idCuentaBancaria) {
        this.idCuentaBancaria = idCuentaBancaria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoExtraccionDeposito != null ? codigoExtraccionDeposito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExtraccionDeposito)) {
            return false;
        }
        ExtraccionDeposito other = (ExtraccionDeposito) object;
        if ((this.codigoExtraccionDeposito == null && other.codigoExtraccionDeposito != null) || (this.codigoExtraccionDeposito != null && !this.codigoExtraccionDeposito.equals(other.codigoExtraccionDeposito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.ExtraccionDeposito[ codigoExtraccionDeposito=" + codigoExtraccionDeposito + " ]";
    }
    
}
