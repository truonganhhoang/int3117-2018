describe('The Login Page', function () {

  it('Test Login', function () {
    // destructuring assignment of the this.currentUser object
    const { username, password } = this.currentUser

    cy.visit('https://accounts.sachmem.vn/users/sign_in')

    // cy.get('@user_email]').type(username)

    // cy.get('@user_password]').type(`${password}{enter}`)
    password  = 'HaHaHa@12#$%'
    cy.get('a.btn-google').click()
    cy.url().should('include', 'https://accounts.google.com/signin/oauth')
    if(cy.find('input')==false){
      cy.get('div[jsname=rwl3qc]').click()
    }
    cy.get('input').type('trieuhoangan1012@gmail.com')
    cy.get('@identifierNext').click()
    cy.get('input[name=password]').type(`${password}{enter}`)

    cy.url.should('include','/folder')
    cy.getCookie('_ga').should('exist')
    cy.getCookie('_gat').should('exist')
    cy.getCookie('_gid').should('exist')

  })
})