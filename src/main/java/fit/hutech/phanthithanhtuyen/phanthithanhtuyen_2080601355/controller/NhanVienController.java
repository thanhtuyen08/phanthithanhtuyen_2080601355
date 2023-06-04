package fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.controller;

import fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.model.NhanVien;
import fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.service.NhanVienService;
import fit.hutech.phanthithanhtuyen.phanthithanhtuyen_2080601355.service.PhongBanService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
@RequestMapping("/nhanvien")
public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienService;
    @Autowired
    private PhongBanService phongBanService;
    @GetMapping("/view")
    public String index(Model model){
        model.addAttribute("listNV", nhanVienService.getAllNV());
        return "nhanviens/index";
    }
    @GetMapping("/addnew")
    public String add(Model model){
        NhanVien nhanvien = new NhanVien();
        model.addAttribute("nhanvien",nhanvien);
        return "nhanviens/add";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("nhanvien") NhanVien nhanvien) {
        nhanVienService.saveNV(nhanvien);
        return "redirect:/nhanvien/view";
    }

    @GetMapping("del/{id}")
    public String removeItem(@PathVariable("id")String id) {
        nhanVienService.delNV(id);
        return "redirect:/nhanvien/view";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") String id, Model model){
        NhanVien editNV = null;
        for(NhanVien nhanVien : nhanVienService.getAllNV()){
            if(nhanVien.getId().equals(id)){
                editNV = nhanVien;
            }
        }
        if(editNV != null){
            model.addAttribute("nhanvien",editNV);
            return "nhanviens/edit";
        }else{
            return "not-found";
        }
    }
    @PostMapping ("/edit")
    public String edit(@Valid @ModelAttribute("nv") NhanVien updatedNV
            , BindingResult bindingResult, Model model)throws IOException{
        if(bindingResult.hasErrors()){
            return "nhanviens/edit";
        }

        for(int i = 0; i<nhanVienService.getAllNV().size();i++){
            NhanVien product = nhanVienService.getAllNV().get(i);
            if(product.getId() == updatedNV.getId()){
                nhanVienService.getAllNV().set(i,updatedNV);
                nhanVienService.saveNV(updatedNV);
                break;
            }
        }
        return "redirect:/nhanvien/view";
    }


}
