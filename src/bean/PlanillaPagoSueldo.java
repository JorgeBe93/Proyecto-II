/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jorge
 */
@Entity
@Table(name = "planilla_pago_sueldo")
@NamedQueries({
    @NamedQuery(name = "PlanillaPagoSueldo.findAll", query = "SELECT p FROM PlanillaPagoSueldo p"),
    @NamedQuery(name = "PlanillaPagoSueldo.findByIdPago", query = "SELECT p FROM PlanillaPagoSueldo p WHERE p.idPago = :idPago"),
    @NamedQuery(name = "PlanillaPagoSueldo.findByFechaPago", query = "SELECT p FROM PlanillaPagoSueldo p WHERE p.fechaPago = :fechaPago"),
    @NamedQuery(name = "PlanillaPagoSueldo.findBySalarioBase", query = "SELECT p FROM PlanillaPagoSueldo p WHERE p.salarioBase = :salarioBase"),
    @NamedQuery(name = "PlanillaPagoSueldo.findByDescuentoIPS", query = "SELECT p FROM PlanillaPagoSueldo p WHERE p.descuentoIPS = :descuentoIPS"),
    @NamedQuery(name = "PlanillaPagoSueldo.findByMultas", query = "SELECT p FROM PlanillaPagoSueldo p WHERE p.multas = :multas"),
    @NamedQuery(name = "PlanillaPagoSueldo.findByExtras", query = "SELECT p FROM PlanillaPagoSueldo p WHERE p.extras = :extras"),
    @NamedQuery(name = "PlanillaPagoSueldo.findByLiquidoCobrado", query = "SELECT p FROM PlanillaPagoSueldo p WHERE p.liquidoCobrado = :liquidoCobrado")})
public class PlanillaPagoSueldo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPago")
    private Integer idPago;
    @Basic(optional = false)
    @Column(name = "fechaPago")
    @Temporal(TemporalType.DATE)
    private Date fechaPago;
    @Basic(optional = false)
    @Column(name = "salarioBase")
    private int salarioBase;
    @Basic(optional = false)
    @Column(name = "descuentoIPS")
    private int descuentoIPS;
    @Column(name = "multas")
    private Integer multas;
    @Column(name = "extras")
    private Integer extras;
    @Basic(optional = false)
    @Column(name = "liquidoCobrado")
    private int liquidoCobrado;
    @JoinColumn(name = "codigoEmpleado", referencedColumnName = "codigoEmpleado")
    @ManyToOne(optional = false)
    private Empleado codigoEmpleado;

    public PlanillaPagoSueldo() {
    }

    public PlanillaPagoSueldo(Integer idPago) {
        this.idPago = idPago;
    }

    public PlanillaPagoSueldo(Integer idPago, Date fechaPago, int salarioBase, int descuentoIPS, int liquidoCobrado) {
        this.idPago = idPago;
        this.fechaPago = fechaPago;
        this.salarioBase = salarioBase;
        this.descuentoIPS = descuentoIPS;
        this.liquidoCobrado = liquidoCobrado;
    }

    public Integer getIdPago() {
        return idPago;
    }

    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getDescuentoIPS() {
        return descuentoIPS;
    }

    public void setDescuentoIPS(int descuentoIPS) {
        this.descuentoIPS = descuentoIPS;
    }

    public Integer getMultas() {
        return multas;
    }

    public void setMultas(Integer multas) {
        this.multas = multas;
    }

    public Integer getExtras() {
        return extras;
    }

    public void setExtras(Integer extras) {
        this.extras = extras;
    }

    public int getLiquidoCobrado() {
        return liquidoCobrado;
    }

    public void setLiquidoCobrado(int liquidoCobrado) {
        this.liquidoCobrado = liquidoCobrado;
    }

    public Empleado getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(Empleado codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPago != null ? idPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanillaPagoSueldo)) {
            return false;
        }
        PlanillaPagoSueldo other = (PlanillaPagoSueldo) object;
        if ((this.idPago == null && other.idPago != null) || (this.idPago != null && !this.idPago.equals(other.idPago))) {
            return false;
        }
        return true;
    }

    /*   @Override
    public String toString() {
    return "bean.PlanillaPagoSueldo[ idPago=" + idPago + " ]";
    }
     */
    @Override
    public String toString() {
        return  "idPago=" + idPago + ", fechaPago=" + fechaPago + ", salarioBase=" + salarioBase + ", descuentoIPS=" + descuentoIPS + ", multas=" + multas + ", extras=" + extras + ", liquidoCobrado=" + liquidoCobrado + ", codigoEmpleado=" + codigoEmpleado;
    }
    
}
