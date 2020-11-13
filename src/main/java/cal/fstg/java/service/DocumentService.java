package cal.fstg.java.service;

import cal.fstg.java.dao.DocumentRepository;
import cal.fstg.java.dao.EmployerRepository;
import cal.fstg.java.model.Document;
import cal.fstg.java.model.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentService {

    private final DocumentRepository documentRepository;

    @Autowired
    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public List<Document> getAll() {
        return documentRepository.findAll();
    }

    public Optional<Document> getOne(long id) {
        return documentRepository.findById(id);
    }

    public Document save(Document document) {
        return documentRepository.save(document);
    }

    public void delete(long id) {
        documentRepository.deleteById(id);
    }
}
