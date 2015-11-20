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
@Table(name = "cuenta_bancaria")
@NamedQueries({
    @NamedQuery(name = "CuentaBancaria.findAll", query = "SELECT c FROM CuentaBancaria c"),
    @NamedQuery(name = "CuentaBancaria.findByIdCuentaBancaria", query = "SELECT c FROM CuentaBancaria c WHERE c.idCuentaBancaria = :idCuentaBancaria"),
    @NamedQuery(name = "CuentaBancaria.findByTipoCuenta", query = "SELECT c FROM CuentaBancaria c WHERE c.tipoCuenta = :tipoCuenta"),
    @NamedQuery(name = "CuentaBancaria.findByMontoActual", query = "SELECT c FROM CuentaBancaria c WHERE c.montoActual = :montoActual"),
    @NamedQuery(name = "CuentaBancaria.findByTitular", query = "SELECT c FROM CuentaBancaria c WHERE c.titular = :titular"),
    @NamedQuery(name = "CuentaBancaria.findByTipoMoneda", query = "SELECT c FROM CuentaBancaria c WHERE c.tipoMoneda = :tipoMoneda"),
    @NamedQuery(name = "CuentaBancaria.findByNumeroCuenta", query = "SELECT c FROM CuentaBancaria c WHERE c.numeroCuenta = :numeroCuenta")})
public class CuentaBancaria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCuentaBancaria")
    private Integer idCuentaBancaria;
    @Basic(optional = false)
    @Column(name = "tipo_cuenta")
    private String tipoCuenta;
    @Column(name = "monto_actual")
    private Integer montoActual;
    @Basic(optional = false)
    @Column(name = "titular")
    private String titular;
    @Column(name = "tipo_moneda")
    private String tipoMoneda;
    @Basic(optional = false)
    @Column(name = "numero_cuenta")
    private String numeroCuenta;
    @JoinColumn(name = "idBanco", referencedColumnName = "idBanco")
    @ManyToOne(optional = false)
    private Banco idBanco;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCuentaBancaria")
    private Collection<ExtraccionDeposito> extraccionDepositoCollection;

    public CuentaBancaria() {
    }

    public CuentaBancaria(Integer idCuentaBancaria) {
        this.idCuentaBancaria = idCuentaBancaria;
    }

    public CuentaBancaria(Integer idCuentaBancaria, String tipoCuenta, String titular, String numeroCuenta) {
        this.idCuentaBancaria = idCuentaBancaria;
        this.tipoCuenta = tipoCuenta;
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
    }

    public Integer getIdCuentaBancaria() {
        return idCuentaBancaria;
    }

    public void setIdCuentaBancaria(Integer idCuentaBancaria) {
        this.idCuentaBancaria = idCuentaBancaria;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public Integer getMontoActual() {
        return montoActual;
    }

    public void setMontoActual(Integer montoActual) {
        this.montoActual = montoActual;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Banco getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(Banco idBanco) {
        this.idBanco = idBanco;
    }

    public Collection<ExtraccionDeposito> getExtraccionDepositoCollection() {
        return extraccionDepositoCollection;
    }

    public void setExtraccionDepositoCollection(Collection<ExtraccionDeposito> extraccionDepositoCollection) {
        this.extraccionDepositoCollection = extraccionDepositoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCuentaBancaria != null ? idCuentaBancaria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CuentaBancaria)) {
            return false;
        }
        CuentaBancaria other = (CuentaBancaria) object;
        if ((this.idCuentaBancaria == null && other.idCuentaBancaria != null) || (this.idCuentaBancaria != null && !this.idCuentaBancaria.equals(other.idCuentaBancaria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.CuentaBancaria[ idCuentaBancaria=" + idCuentaBancaria + " ]";
    }
    
}
