package cal.fstg.java.controller;

//import cal.fstg.java.model.Admin;
//import cal.fstg.java.model.Document;
//import cal.fstg.java.service.AdminService;
//import cal.fstg.java.service.DocumentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;

//@RestController
//@RequestMapping("/documents")
//public class DocumentController {
//
//    private final DocumentService documentService;
//
//    @Autowired
//    public DocumentController(DocumentService documentService) {
//        this.documentService = documentService;
//    }
//
//    @GetMapping("/get/all")
//    public List<Document> getAll() {
//        return documentService.getAll();
//    }
//
//    @GetMapping("/get/{id}")
//    public Optional<Document> getOne(@PathVariable long id) {
//        return documentService.getOne(id);
//    }
//
//    @PostMapping("/save")
//    public void save(@RequestBody Document document) {
//        documentService.save(document);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public void delete(@PathVariable long id) {
//        documentService.delete(id);
//    }
//}
