package com.example.kirana_backend;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Crucial: Allows your Vercel frontend to talk to this backend
public class KiranaController {

    @GetMapping("/status")
    public String getStatus() {
        return "Kirana Backend is Online!";
    }

    // This is where you will handle the AI scan data
    @PostMapping("/scan")
    public String processScan(@RequestBody String data) {
        return "Backend received scan: " + data;
    }
}