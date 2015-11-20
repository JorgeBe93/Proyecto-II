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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Jorge
 */
@Entity
@Table(name = "categoria_articulo")
@NamedQueries({
    @NamedQuery(name = "CategoriaArticulo.findAll", query = "SELECT c FROM CategoriaArticulo c"),
    @NamedQuery(name = "CategoriaArticulo.findByCodCategoria", query = "SELECT c FROM CategoriaArticulo c WHERE c.codCategoria = :codCategoria"),
    @NamedQuery(name = "CategoriaArticulo.findByDescripcion", query = "SELECT c FROM CategoriaArticulo c WHERE c.descripcion = :descripcion")})
public class CategoriaArticulo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_categoria")
    private Integer codCategoria;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codCategoria")
    private Collection<Articulo> articuloCollection;

    public CategoriaArticulo() {
    }

    public CategoriaArticulo(Integer codCategoria) {
        this.codCategoria = codCategoria;
    }

    public CategoriaArticulo(Integer codCategoria, String descripcion) {
        this.codCategoria = codCategoria;
        this.descripcion = descripcion;
    }

    public Integer getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(Integer codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Collection<Articulo> getArticuloCollection() {
        return articuloCollection;
    }

    public void setArticuloCollection(Collection<Articulo> articuloCollection) {
        this.articuloCollection = articuloCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCategoria != null ? codCategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaArticulo)) {
            return false;
        }
        CategoriaArticulo other = (CategoriaArticulo) object;
        if ((this.codCategoria == null && other.codCategoria != null) || (this.codCategoria != null && !this.codCategoria.equals(other.codCategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.CategoriaArticulo[ codCategoria=" + codCategoria + " ]";
    }
    
}
