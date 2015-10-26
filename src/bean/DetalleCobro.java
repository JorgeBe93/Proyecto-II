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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Jorge
 */
@Entity
@Table(name = "detalle_cobro")
@NamedQueries({
    @NamedQuery(name = "DetalleCobro.findAll", query = "SELECT d FROM DetalleCobro d"),
    @NamedQuery(name = "DetalleCobro.findByIdDetalle", query = "SELECT d FROM DetalleCobro d WHERE d.idDetalle = :idDetalle"),
    @NamedQuery(name = "DetalleCobro.findByForma", query = "SELECT d FROM DetalleCobro d WHERE d.forma = :forma"),
    @NamedQuery(name = "DetalleCobro.findByNumeroChTarj", query = "SELECT d FROM DetalleCobro d WHERE d.numeroChTarj = :numeroChTarj"),
    @NamedQuery(name = "DetalleCobro.findByEntidad", query = "SELECT d FROM DetalleCobro d WHERE d.entidad = :entidad")})
public class DetalleCobro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDetalle")
    private Integer idDetalle;
    @Basic(optional = false)
    @Column(name = "forma")
    private String forma;
    @Basic(optional = false)
    @Column(name = "numero_ch_tarj")
    private String numeroChTarj;
    @Basic(optional = false)
    @Column(name = "entidad")
    private String entidad;

    public DetalleCobro() {
    }

    public DetalleCobro(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    public DetalleCobro(Integer idDetalle, String forma, String numeroChTarj, String entidad) {
        this.idDetalle = idDetalle;
        this.forma = forma;
        this.numeroChTarj = numeroChTarj;
        this.entidad = entidad;
    }

    public Integer getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getNumeroChTarj() {
        return numeroChTarj;
    }

    public void setNumeroChTarj(String numeroChTarj) {
        this.numeroChTarj = numeroChTarj;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalle != null ? idDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleCobro)) {
            return false;
        }
        DetalleCobro other = (DetalleCobro) object;
        if ((this.idDetalle == null && other.idDetalle != null) || (this.idDetalle != null && !this.idDetalle.equals(other.idDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.DetalleCobro[ idDetalle=" + idDetalle + " ]";
    }
    
}
