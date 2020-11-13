
package com.nwpu.todoservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nwpu.todoservice package. 
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

    private final static QName _RegisterResponse_QNAME = new QName("http://www.todoservice.nwpu.com", "registerResponse");
    private final static QName _FindUserResponse_QNAME = new QName("http://www.todoservice.nwpu.com", "findUserResponse");
    private final static QName _AddTodoResponse_QNAME = new QName("http://www.todoservice.nwpu.com", "addTodoResponse");
    private final static QName _DeleteTodoResponse_QNAME = new QName("http://www.todoservice.nwpu.com", "deleteTodoResponse");
    private final static QName _Register_QNAME = new QName("http://www.todoservice.nwpu.com", "register");
    private final static QName _DeleteTodo_QNAME = new QName("http://www.todoservice.nwpu.com", "deleteTodo");
    private final static QName _ClearTodoResponse_QNAME = new QName("http://www.todoservice.nwpu.com", "clearTodoResponse");
    private final static QName _LoginResponse_QNAME = new QName("http://www.todoservice.nwpu.com", "loginResponse");
    private final static QName _FindUser_QNAME = new QName("http://www.todoservice.nwpu.com", "findUser");
    private final static QName _CheckTodoResponse_QNAME = new QName("http://www.todoservice.nwpu.com", "checkTodoResponse");
    private final static QName _CheckTodo_QNAME = new QName("http://www.todoservice.nwpu.com", "checkTodo");
    private final static QName _ClearTodo_QNAME = new QName("http://www.todoservice.nwpu.com", "clearTodo");
    private final static QName _Login_QNAME = new QName("http://www.todoservice.nwpu.com", "login");
    private final static QName _AddTodo_QNAME = new QName("http://www.todoservice.nwpu.com", "addTodo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nwpu.todoservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindUser }
     * 
     */
    public FindUser createFindUser() {
        return new FindUser();
    }

    /**
     * Create an instance of {@link CheckTodoResponse }
     * 
     */
    public CheckTodoResponse createCheckTodoResponse() {
        return new CheckTodoResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link ClearTodo }
     * 
     */
    public ClearTodo createClearTodo() {
        return new ClearTodo();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link AddTodo }
     * 
     */
    public AddTodo createAddTodo() {
        return new AddTodo();
    }

    /**
     * Create an instance of {@link CheckTodo }
     * 
     */
    public CheckTodo createCheckTodo() {
        return new CheckTodo();
    }

    /**
     * Create an instance of {@link FindUserResponse }
     * 
     */
    public FindUserResponse createFindUserResponse() {
        return new FindUserResponse();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link ClearTodoResponse }
     * 
     */
    public ClearTodoResponse createClearTodoResponse() {
        return new ClearTodoResponse();
    }

    /**
     * Create an instance of {@link DeleteTodo }
     * 
     */
    public DeleteTodo createDeleteTodo() {
        return new DeleteTodo();
    }

    /**
     * Create an instance of {@link AddTodoResponse }
     * 
     */
    public AddTodoResponse createAddTodoResponse() {
        return new AddTodoResponse();
    }

    /**
     * Create an instance of {@link DeleteTodoResponse }
     * 
     */
    public DeleteTodoResponse createDeleteTodoResponse() {
        return new DeleteTodoResponse();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link Todo }
     * 
     */
    public Todo createTodo() {
        return new Todo();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.todoservice.nwpu.com", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.todoservice.nwpu.com", name = "findUserResponse")
    public JAXBElement<FindUserResponse> createFindUserResponse(FindUserResponse value) {
        return new JAXBElement<FindUserResponse>(_FindUserResponse_QNAME, FindUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTodoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.todoservice.nwpu.com", name = "addTodoResponse")
    public JAXBElement<AddTodoResponse> createAddTodoResponse(AddTodoResponse value) {
        return new JAXBElement<AddTodoResponse>(_AddTodoResponse_QNAME, AddTodoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTodoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.todoservice.nwpu.com", name = "deleteTodoResponse")
    public JAXBElement<DeleteTodoResponse> createDeleteTodoResponse(DeleteTodoResponse value) {
        return new JAXBElement<DeleteTodoResponse>(_DeleteTodoResponse_QNAME, DeleteTodoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.todoservice.nwpu.com", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTodo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.todoservice.nwpu.com", name = "deleteTodo")
    public JAXBElement<DeleteTodo> createDeleteTodo(DeleteTodo value) {
        return new JAXBElement<DeleteTodo>(_DeleteTodo_QNAME, DeleteTodo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearTodoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.todoservice.nwpu.com", name = "clearTodoResponse")
    public JAXBElement<ClearTodoResponse> createClearTodoResponse(ClearTodoResponse value) {
        return new JAXBElement<ClearTodoResponse>(_ClearTodoResponse_QNAME, ClearTodoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.todoservice.nwpu.com", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.todoservice.nwpu.com", name = "findUser")
    public JAXBElement<FindUser> createFindUser(FindUser value) {
        return new JAXBElement<FindUser>(_FindUser_QNAME, FindUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckTodoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.todoservice.nwpu.com", name = "checkTodoResponse")
    public JAXBElement<CheckTodoResponse> createCheckTodoResponse(CheckTodoResponse value) {
        return new JAXBElement<CheckTodoResponse>(_CheckTodoResponse_QNAME, CheckTodoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckTodo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.todoservice.nwpu.com", name = "checkTodo")
    public JAXBElement<CheckTodo> createCheckTodo(CheckTodo value) {
        return new JAXBElement<CheckTodo>(_CheckTodo_QNAME, CheckTodo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearTodo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.todoservice.nwpu.com", name = "clearTodo")
    public JAXBElement<ClearTodo> createClearTodo(ClearTodo value) {
        return new JAXBElement<ClearTodo>(_ClearTodo_QNAME, ClearTodo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.todoservice.nwpu.com", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTodo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.todoservice.nwpu.com", name = "addTodo")
    public JAXBElement<AddTodo> createAddTodo(AddTodo value) {
        return new JAXBElement<AddTodo>(_AddTodo_QNAME, AddTodo.class, null, value);
    }

}
