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
    @NamedQuery(name = "Asistencia.findByHorasTrabajadas", query = "SELECT a FROM Asistencia a WHERE a.horasTrabajadas = :horasTrabajadas")})
public class Asistencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigoAsistencia")
    private Integer codigoAsistencia;
    @Column(name = "horaEntrada")
    private String horaEntrada;
    @Column(name = "horaSalida")
    private String horaSalida;
    @Basic(optional = false)
    @Column(name = "fechaAsistencia")
    @Temporal(TemporalType.DATE)
    private Date fechaAsistencia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "horasTrabajadas")
    private Float horasTrabajadas;
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

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Date getFechaAsistencia() {
        return fechaAsistencia;
    }

    public void setFechaAsistencia(Date fechaAsistencia) {
        this.fechaAsistencia = fechaAsistencia;
    }

    public Float getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(Float horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
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
