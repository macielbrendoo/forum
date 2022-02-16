# Spring Boot API REST: Construa uma API

Projeto desenvolvido durante o curso de spring da alura, os seguintes tópicos foram apresentados durante o curso:
* Um resumo da história e evolução do Spring;
* Criar um projeto com Spring Boot usando Spring Initialzr
* pom.xml de uma aplicação Spring Boot;
* Inicializar projeto Spring Boot, usa-se método main;
* Anotações:
  * @Controller
  * @RequestMapping
  * @ResponseBody
  * @RestController
  * @Entity
  * @Id
  * @GeneratedValue
  * @ManyToOne
  * @OneToMany
  * @Enumerated
  * @Query
  * @PostMapping
  * @GetMapping
  * @NotNull
  * @NotEmpty
  * @Size
  * @Valid
  * @RestControllerAdvice
  * @ExceptionHandler
  * @ResponseStatus
  * @PathVariable
  * @PutMapping
  * @Transactional
  * @DeleteMapping
* Biblioteca Jackson;
* Spring Boot DevTools;
* padrão DTO (Data Transfer Object);
* Spring JPA, Hibernate
* DataBase h2
* Popular automaticamente o DB no Spring Boot
* JPARepository do Spring Data JPA; 
* Criar consultas pelo JPARepository
* ResponseEntity, BeanValidation
* Tratar objetos não encontrados com o `findById`
* Usando o objeto `Optional<>`

# Spring Boot API Rest: Segurança da API, Cache e Monitoramento

Iniciou a continuidade do curso acima, onde foi aprensentado os seguintes tópicos:
* Interface `Pageable`
* Objeto `Page`
* Ordenação com `Pageable`
* Anotação `@SpringDataWebSupport`, `@EnableCaching`, `@Cacheable`, `@CacheEvict`, `@EnableWebSecurity`
* Spring Security
* Criar token `JWT` e devolver ao client
* Validar token
* Spring Boot Admin e Spring Boot Actuator
* SpringFox Swagger