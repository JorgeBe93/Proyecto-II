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
@Table(name = "asistencia")
@NamedQueries({
    @NamedQuery(name = "Asistencia.findAll", query = "SELECT a FROM Asistencia a"),
    @NamedQuery(name = "Asistencia.findByCodigoAsistencia", query = "SELECT a FROM Asistencia a WHERE a.codigoAsistencia = :codigoAsistencia"),
    @NamedQuery(name = "Asistencia.findByHoraEntrada", query = "SELECT a FROM Asistencia a WHERE a.horaEntrada = :horaEntrada"),
    @NamedQuery(name = "Asistencia.findByHoraSalida", query = "SELECT a FROM Asistencia a WHERE a.horaSalida = :horaSalida"),
    @NamedQuery(name = "Asistencia.findByFechaAsistencia", query = "SELECT a FROM Asistencia a WHERE a.fechaAsistencia = :fechaAsistencia"),
    @NamedQuery(name = "Asistencia.findByEsDiaHabil", query = "SELECT a FROM Asistencia a WHERE a.esDiaHabil = :esDiaHabil"),
    @NamedQuery(name = "Asistencia.findByExtra", query = "SELECT a FROM Asistencia a WHERE a.extra = :extra"),
    @NamedQuery(name = "Asistencia.findByHorasInconclusas", query = "SELECT a FROM Asistencia a WHERE a.horasInconclusas = :horasInconclusas")})
public class Asistencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoAsistencia")
    private Integer codigoAsistencia;
    @Column(name = "horaEntrada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaEntrada;
    @Column(name = "horaSalida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaSalida;
    @Basic(optional = false)
    @Column(name = "fechaAsistencia")
    @Temporal(TemporalType.DATE)
    private Date fechaAsistencia;
    @Column(name = "es_dia_habil")
    private String esDiaHabil;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "extra")
    private Float extra;
    @Column(name = "horas_inconclusas")
    private Float horasInconclusas;
    @JoinColumn(name = "codigoEmpleado", referencedColumnName = "codigoEmpleado")
    @ManyToOne(optional = false)
    private Empleado codigoEmpleado;

    public Asistencia() {
    }

    public Asistencia(Integer codigoAsistencia) {
        this.codigoAsistencia = codigoAsistencia;
    }

    public Asistencia(Integer codigoAsistencia, Date fechaAsistencia) {
        this.codigoAsistencia = codigoAsistencia;
        this.fechaAsistencia = fechaAsistencia;
    }

    public Integer getCodigoAsistencia() {
        return codigoAsistencia;
    }

    public void setCodigoAsistencia(Integer codigoAsistencia) {
        this.codigoAsistencia = codigoAsistencia;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Date getFechaAsistencia() {
        return fechaAsistencia;
    }

    public void setFechaAsistencia(Date fechaAsistencia) {
        this.fechaAsistencia = fechaAsistencia;
    }

    public String getEsDiaHabil() {
        return esDiaHabil;
    }

    public void setEsDiaHabil(String esDiaHabil) {
        this.esDiaHabil = esDiaHabil;
    }

    public Float getExtra() {
        return extra;
    }

    public void setExtra(Float extra) {
        this.extra = extra;
    }

    public Float getHorasInconclusas() {
        return horasInconclusas;
    }

    public void setHorasInconclusas(Float horasInconclusas) {
        this.horasInconclusas = horasInconclusas;
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
        hash += (codigoAsistencia != null ? codigoAsistencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asistencia)) {
            return false;
        }
        Asistencia other = (Asistencia) object;
        if ((this.codigoAsistencia == null && other.codigoAsistencia != null) || (this.codigoAsistencia != null && !this.codigoAsistencia.equals(other.codigoAsistencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Asistencia[ codigoAsistencia=" + codigoAsistencia + " ]";
    }
    
}
