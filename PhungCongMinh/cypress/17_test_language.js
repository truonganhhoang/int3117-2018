describe('test change language', function(){
    it('visit hoc lieu', function(){
        cy.visit('https://hoclieu.sachmem.vn/folder/0')
    })
    it('click language dropdown',function(){
        cy.get('#languageDropdown').click()
    })
    it('change language to english',function(){
        cy.contains('English').click()  
    })
    it('check laguage after change to english',function(){
        cy.get('#languageDropdown').should('have.contain', 'English')
    })
})
