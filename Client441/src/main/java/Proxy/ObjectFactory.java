
package Proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Proxy package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Compte_QNAME = new QName("http://example.org/", "Compte");
    private final static QName _Convert_QNAME = new QName("http://example.org/", "Convert");
    private final static QName _ConvertResponse_QNAME = new QName("http://example.org/", "ConvertResponse");
    private final static QName _ListComptes_QNAME = new QName("http://example.org/", "ListComptes");
    private final static QName _ListComptesResponse_QNAME = new QName("http://example.org/", "ListComptesResponse");
    private final static QName _GetComte_QNAME = new QName("http://example.org/", "getComte");
    private final static QName _GetComteResponse_QNAME = new QName("http://example.org/", "getComteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link Convert }
     * 
     * @return
     *     the new instance of {@link Convert }
     */
    public Convert createConvert() {
        return new Convert();
    }

    /**
     * Create an instance of {@link ConvertResponse }
     * 
     * @return
     *     the new instance of {@link ConvertResponse }
     */
    public ConvertResponse createConvertResponse() {
        return new ConvertResponse();
    }

    /**
     * Create an instance of {@link ListComptes }
     * 
     * @return
     *     the new instance of {@link ListComptes }
     */
    public ListComptes createListComptes() {
        return new ListComptes();
    }

    /**
     * Create an instance of {@link ListComptesResponse }
     * 
     * @return
     *     the new instance of {@link ListComptesResponse }
     */
    public ListComptesResponse createListComptesResponse() {
        return new ListComptesResponse();
    }

    /**
     * Create an instance of {@link GetComte }
     * 
     * @return
     *     the new instance of {@link GetComte }
     */
    public GetComte createGetComte() {
        return new GetComte();
    }

    /**
     * Create an instance of {@link GetComteResponse }
     * 
     * @return
     *     the new instance of {@link GetComteResponse }
     */
    public GetComteResponse createGetComteResponse() {
        return new GetComteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "Compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Convert }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Convert }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "Convert")
    public JAXBElement<Convert> createConvert(Convert value) {
        return new JAXBElement<>(_Convert_QNAME, Convert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "ConvertResponse")
    public JAXBElement<ConvertResponse> createConvertResponse(ConvertResponse value) {
        return new JAXBElement<>(_ConvertResponse_QNAME, ConvertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListComptes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListComptes }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "ListComptes")
    public JAXBElement<ListComptes> createListComptes(ListComptes value) {
        return new JAXBElement<>(_ListComptes_QNAME, ListComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListComptesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListComptesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "ListComptesResponse")
    public JAXBElement<ListComptesResponse> createListComptesResponse(ListComptesResponse value) {
        return new JAXBElement<>(_ListComptesResponse_QNAME, ListComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetComte }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "getComte")
    public JAXBElement<GetComte> createGetComte(GetComte value) {
        return new JAXBElement<>(_GetComte_QNAME, GetComte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetComteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "getComteResponse")
    public JAXBElement<GetComteResponse> createGetComteResponse(GetComteResponse value) {
        return new JAXBElement<>(_GetComteResponse_QNAME, GetComteResponse.class, null, value);
    }

}
