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
@Table(name = "presupuesto")
@NamedQueries({
    @NamedQuery(name = "Presupuesto.findAll", query = "SELECT p FROM Presupuesto p"),
    @NamedQuery(name = "Presupuesto.findByNumPresupuesto", query = "SELECT p FROM Presupuesto p WHERE p.numPresupuesto = :numPresupuesto"),
    @NamedQuery(name = "Presupuesto.findByEstado", query = "SELECT p FROM Presupuesto p WHERE p.estado = :estado"),
    @NamedQuery(name = "Presupuesto.findByFechaEmision", query = "SELECT p FROM Presupuesto p WHERE p.fechaEmision = :fechaEmision")})
public class Presupuesto implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "numPresupuesto")
    private Integer numPresupuesto;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @Column(name = "fechaEmision")
    private String fechaEmision;
    @JoinColumn(name = "codigoCliente", referencedColumnName = "codigoCliente")
    @ManyToOne(optional = false)
    private Cliente codigoCliente;

    public Presupuesto() {
    }

    public Presupuesto(Integer numPresupuesto) {
        this.numPresupuesto = numPresupuesto;
    }

    public Presupuesto(Integer numPresupuesto, String estado, String fechaEmision) {
        this.numPresupuesto = numPresupuesto;
        this.estado = estado;
        this.fechaEmision = fechaEmision;
    }

    public Integer getNumPresupuesto() {
        return numPresupuesto;
    }

    public void setNumPresupuesto(Integer numPresupuesto) {
        Integer oldNumPresupuesto = this.numPresupuesto;
        this.numPresupuesto = numPresupuesto;
        changeSupport.firePropertyChange("numPresupuesto", oldNumPresupuesto, numPresupuesto);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        String oldEstado = this.estado;
        this.estado = estado;
        changeSupport.firePropertyChange("estado", oldEstado, estado);
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        String oldFechaEmision = this.fechaEmision;
        this.fechaEmision = fechaEmision;
        changeSupport.firePropertyChange("fechaEmision", oldFechaEmision, fechaEmision);
    }

    public Cliente getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Cliente codigoCliente) {
        Cliente oldCodigoCliente = this.codigoCliente;
        this.codigoCliente = codigoCliente;
        changeSupport.firePropertyChange("codigoCliente", oldCodigoCliente, codigoCliente);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numPresupuesto != null ? numPresupuesto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Presupuesto)) {
            return false;
        }
        Presupuesto other = (Presupuesto) object;
        if ((this.numPresupuesto == null && other.numPresupuesto != null) || (this.numPresupuesto != null && !this.numPresupuesto.equals(other.numPresupuesto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Presupuesto[ numPresupuesto=" + numPresupuesto + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
