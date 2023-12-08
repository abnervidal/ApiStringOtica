// package com.example.apispringotica.controllers;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.access.annotation.Secured;
// // import org.springframework.security.access.annotation.Secured;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// // import com.example.apispringotica.entities.Cliente;
// import com.example.apispringotica.entities.OrdemServico;
// import com.example.apispringotica.services.OrdemServicoService;

// @RestController
// @RequestMapping("/ordemservicos")
// public class OrdemServicoController {
//     @Autowired
//     private OrdemServicoService ordemServicoService;

//     @PostMapping
//     @Secured(value = { "ROLE_ADMIN", "ROLE_MEDICO", "ROLE_VENDEDOR" })
//     List<OrdemServico> create(@RequestBody OrdemServico ordemServico){
//         return ordemServicoService.create(ordemServico);
//     }
//     @GetMapping
//     @Secured(value = { "ROLE_ADMIN", "ROLE_MEDICO", "ROLE_VENDEDOR" })
//     List<OrdemServico> list(){
//         return ordemServicoService.list();
//     }
//     @PutMapping
//     @Secured(value = { "ROLE_ADMIN", "ROLE_MEDICO", "ROLE_VENDEDOR" })
//     List<OrdemServico> update(@RequestBody OrdemServico ordemServico){
//         return ordemServicoService.update(ordemServico);
//     }
//     @DeleteMapping("{id}")
//     @Secured(value = { "ROLE_ADMIN", "ROLE_MEDICO", "ROLE_VENDEDOR" })
//     List<OrdemServico> delete(@PathVariable("id") Integer idOrdemServico){
//         return ordemServicoService.delete(idOrdemServico);
//     }

//     @GetMapping("/clientes/{id}")
//     @Secured(value = { "ROLE_ADMIN", "ROLE_MEDICO", "ROLE_VENDEDOR" })
//     public List<OrdemServico> findBygetOrdemCliente(@PathVariable Integer idCliente) {
//         List<OrdemServico> oredem_servico = ordemServicoService.findBygetOrdemCliente(idCliente);
//         return oredem_servico;
//     }
//     // @GetMapping("/grau/{id}")
//     // public List<OrdemServico> findBygetOrdemGrau(@PathVariable Integer idGrau) {
//     //     List<OrdemServico> oredem_servico = ordemServicoService.findBygetOrdemGrau(idGrau);
//     //     return oredem_servico;
//     // }
//     @GetMapping("/lentes/{id}")
//     @Secured(value = { "ROLE_ADMIN", "ROLE_MEDICO", "ROLE_VENDEDOR" })
//     public List<OrdemServico> findBygetOrdemLente(@PathVariable Integer idLente) {
//         List<OrdemServico> oredem_servico = ordemServicoService.findBygetOrdemLente(idLente);
//         return oredem_servico;
//     }
//     @GetMapping("/armacoes/{id}")
//     @Secured(value = { "ROLE_ADMIN", "ROLE_MEDICO", "ROLE_VENDEDOR" })
//     public List<OrdemServico> findBygetOrdemArmacao(@PathVariable Integer idArmacao) {
//         List<OrdemServico> oredem_servico = ordemServicoService.findBygetOrdemArmacao(idArmacao);
//         return oredem_servico;
//     }
//     // @GetMapping("/status/{id}")
//     // public List<OrdemServico> getOrdemStatus(@PathVariable Integer idStatus) {
//     //     List<OrdemServico> oredem_servico = ordemServicoService.getOrdemStatus(idStatus);
//     //     return oredem_servico;
//     // }
// }
