package ma.fstt.post.post.controllers;

import ma.fstt.post.post.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/post")
public class PostsController {
    @Autowired
    private PostRepository postRepository;


    @RequestMapping(name = "/", method = RequestMethod.GET)
    public List<Post> findAllPosts() {
        return (List<Post>) postRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> findPostById(@PathVariable(value = "id") long id) {
        Optional<Post> Post = postRepository.findById(id);
        if(Post.isPresent()) {
            return ResponseEntity.ok().body(Post.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(name = "/", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Post savePost(@RequestParam("file") MultipartFile file,Post Post) throws IOException {
        File convertFile = new File("/var/tmp/"+file.getOriginalFilename());
        convertFile.createNewFile();
        FileOutputStream fout = new FileOutputStream(convertFile);
        fout.write(file.getBytes());
        fout.close();

        return postRepository.save(Post);
    }



}
