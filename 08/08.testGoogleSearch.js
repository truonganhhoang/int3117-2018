describe('TestGoogle', function(){
    beforeEach(function(){
        cy.visit('https://www.google.com.vn')
    })

    it('changeLanguage', function(){
        cy.contains('English').click()

        cy.contains('Tiếng Việt').click()
    })
   

    it('search',function(){
        cy.get('#lst-ib.gsfi')
        .type('uet{enter}')

    })
})