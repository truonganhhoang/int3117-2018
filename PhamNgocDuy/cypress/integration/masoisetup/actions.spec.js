describe('Kiểm thử Setup Game Quản trò Ma sói Bot', function () {
    it("input[type=range] 4 DÂN / 2 SÓI CHECK", function () {
        cy.visit('https://bautroixa.cf/Web/maSoiBotSetup/')
        cy.get('#dan').as('range')
            .invoke('val', 4)
            .trigger('change')
        cy.get('#soi').as('range')
            .invoke('val', 2)
            .trigger('change')

        // show CÂN BẰNG TEXT:
        cy.get(`label[for='can-bang']`)
            .should(`have.text`, `CÂN BẰNG: -8`)
        // show SỐ LƯỢNG NGƯỜI CHƠI ĐÃ SETUP
        cy.get(`#setup-total`)
            .should(`have.text`, `6`)
        // show CÁC ROLE ĐÃ SETUP CÙNG SỐ LƯỢNG MỖI ROLE
        cy.get(`#setup-result`)
            .should(`have.text`, `2 SÓI, 4 DÂN!`)
        // show SETUP-CODE cho Quản trò Ma Sói Bot
        cy.get(`#setup-code`)
            .should(`have.text`, `{"1":0,"2":0,"3":0,"4":4,"5":0,"6":0,"7":0,"8":0,"9":0,"-3":0,"-2":0,"-1":2}`)
    })

    it("input[type=checkbox] CHECK ALL ROLE", function () {
        cy.visit('https://bautroixa.cf/Web/maSoiBotSetup/')

        // check ALL
        cy.get(`input[type=checkbox]`).check({ force: true }) // checkbox bị wrap bởi label nên phải force

        // show CÂN BẰNG TEXT:
        cy.get(`label[for='can-bang']`)
            .should(`have.text`, `CÂN BẰNG: -3`)
        // show SỐ LƯỢNG NGƯỜI CHƠI ĐÃ SETUP
        cy.get(`#setup-total`)
            .should(`have.text`, `10`)
        // show CÁC ROLE ĐÃ SETUP CÙNG SỐ LƯỢNG MỖI ROLE
        cy.get(`#setup-result`)
            .should(`have.text`, `1 TIÊN TRI, 1 BẢO VỆ, 1 THỢ SĂN, 1 PHÙ THỦY, 1 THIÊN SỨ, 1 SÓI NGUYỀN, 1 BÁN SÓI, 1 NGƯỜI HÓA SÓI, 1 GIÀ LÀNG, 1 CUPID, 0 SÓI, 0 DÂN!`)
        // show SETUP-CODE cho Quản trò Ma Sói Bot
        cy.get(`#setup-code`)
            .should(`have.text`, `{"1":1,"2":1,"3":1,"4":0,"5":1,"6":1,"7":1,"8":1,"9":1,"-3":1,"-2":1,"-1":0}`)
    })

    it("Setup 1 TIÊN TRI, 1 THỢ SĂN, 1 PHÙ THỦY, 1 BÁN SÓI, 1 GIÀ LÀNG, 2 SÓI, 1 DÂN!", function () {
        cy.visit('https://bautroixa.cf/Web/maSoiBotSetup/')

        cy.contains('Tiên tri').click() // thử hàm contains() thay cho check() như bên dưới
        cy.get(`#thoSan`).check({ force: true })
        cy.get(`#phuThuy`).check({ force: true })
        cy.get(`#banSoi`).check({ force: true })
        cy.get(`#giaLang`).check({ force: true })
        cy.get('#dan').as('range')
            .invoke('val', 1)
            .trigger('change')
        cy.get('#soi').as('range')
            .invoke('val', 2)
            .trigger('change')

        // show CÂN BẰNG TEXT:
        cy.get(`label[for='can-bang']`)
            .should(`have.text`, `CÂN BẰNG: -2`)
        // show SỐ LƯỢNG NGƯỜI CHƠI ĐÃ SETUP
        cy.get(`#setup-total`)
            .should(`have.text`, `8`)
        // show CÁC ROLE ĐÃ SETUP CÙNG SỐ LƯỢNG MỖI ROLE
        cy.get(`#setup-result`)
            .should(`have.text`, `1 TIÊN TRI, 1 THỢ SĂN, 1 PHÙ THỦY, 1 BÁN SÓI, 1 GIÀ LÀNG, 2 SÓI, 1 DÂN!`)
        // show SETUP-CODE cho Quản trò Ma Sói Bot
        cy.get(`#setup-code`)
            .should(`have.text`, `{"1":1,"2":0,"3":1,"4":1,"5":1,"6":1,"7":0,"8":0,"9":0,"-3":0,"-2":1,"-1":2}`)
    })

    it("Random button test", function () {
        cy.visit('https://bautroixa.cf/Web/maSoiBotSetup/')

        cy.get('#playersCount').as('select')
            .select(`11`)
        cy.get('#random').as('button').click()

        // show SETUP NGẪU NHIÊN ĐÃ ĐƯỢC ĐỊNH SẴN TRÊN QUẢN TRÒ MA SÓI BOT
        cy.get(`#set`)
            .contains(`>>>{"1":`)
            .should('have.attr', 'href')
    })
    it(`Duyệt SETUP từ URL(params: players,setup)`, function () {
        cy.visit('https://bautroixa.cf/Web/maSoiBotSetup/?players=5&setup={%221%22:1,%222%22:1,%223%22:0,%224%22:1,%225%22:0,%226%22:0,%227%22:0,%228%22:0,%22-3%22:0,%22-2%22:1,%22-1%22:1}')

        // kiểm thử input[checkbox] có được check tự động không?
        cy.get(`#tienTri`).should('be.checked')
        cy.get(`#baoVe`).should('be.checked')
        cy.get(`#banSoi`).should('be.checked')
        // kiểm thử input[range]
        cy.get('#dan').should('have.value', '1')
        cy.get('#soi').should('have.value', '1')

        // show CÂN BẰNG TEXT:
        cy.get(`label[for='can-bang']`)
            .should(`have.text`, `CÂN BẰNG: 2`)
        // show SỐ LƯỢNG NGƯỜI CHƠI ĐÃ SETUP
        cy.get(`#setup-total`)
            .should(`have.text`, `5`)
        // show CÁC ROLE ĐÃ SETUP CÙNG SỐ LƯỢNG MỖI ROLE
        cy.get(`#setup-result`)
            .should(`have.text`, `1 TIÊN TRI, 1 BẢO VỆ, 1 BÁN SÓI, 1 SÓI, 1 DÂN!`)
        // show SETUP-CODE cho Quản trò Ma Sói Bot
        cy.get(`#setup-code`)
            .should(`have.text`, `{"1":1,"2":1,"3":0,"4":1,"5":0,"6":0,"7":0,"8":0,"9":0,"-3":0,"-2":1,"-1":1}`)
    })

    it(`Duyệt SETUP từ URL(params: setup)=>EXPECTED: 5 players`, function () {
        cy.visit('https://bautroixa.cf/Web/maSoiBotSetup/?setup={%221%22:1,%222%22:1,%223%22:0,%224%22:1,%225%22:0,%226%22:0,%227%22:0,%228%22:0,%22-3%22:0,%22-2%22:1,%22-1%22:1}')

        // show SỐ LƯỢNG NGƯỜI CHƠI ĐÃ SETUP
        cy.get(`#setup-total`)
            .should(`have.text`, `5`)
        // show CÂN BẰNG TEXT:
        cy.get(`label[for='can-bang']`)
            .should(`have.text`, `CÂN BẰNG: 2`)
        // show CÁC ROLE ĐÃ SETUP CÙNG SỐ LƯỢNG MỖI ROLE
        cy.get(`#setup-result`)
            .should(`have.text`, `1 TIÊN TRI, 1 BẢO VỆ, 1 BÁN SÓI, 1 SÓI, 1 DÂN!`)
        // show SETUP-CODE cho Quản trò Ma Sói Bot
        cy.get(`#setup-code`)
            .should(`have.text`, `{"1":1,"2":1,"3":0,"4":1,"5":0,"6":0,"7":0,"8":0,"9":0,"-3":0,"-2":1,"-1":1}`)
    })
    it(`Duyệt SETUP từ URL(params: players)`, function () {
        cy.visit('https://bautroixa.cf/Web/maSoiBotSetup/?players=5')

        cy.get('#playersCount').should(`have.value`,`5`)
    })
})